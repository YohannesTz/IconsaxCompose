package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildingThree: ImageVector
    get() {
        val current = _buildingThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BuildingThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.01f, y = 14.75f)
                verticalLineToRelative(dy = 7.24f)
                lineToRelative(dx = -12.0f, dy = 0.02f)
                verticalLineToRelative(dy = -7.26f)
                lineTo(x = 3.0f, y = 13.25f)
                verticalLineTo(y = 7.07f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = -1.66f)
                lineToRelative(dx = 4.0f, dy = -2.67f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.22f, dy1 = 0.0f)
                lineToRelative(dx = 4.0f, dy = 2.67f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 7.07f)
                verticalLineToRelative(dy = 6.18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 21.25f)
                horizontalLineToRelative(dx = -1.27f)
                verticalLineToRelative(dy = -3.0f)
                arcTo(horizontalEllipseRadius = 2.4f, verticalEllipseRadius = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.37f, y1 = 16.0f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 2.39f, b = 2.39f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.76f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.61f, dy1 = 2.24f)
                verticalLineToRelative(dy = 3.01f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 22.75f, x2 = 2.0f, y2 = 22.75f)
                horizontalLineToRelative(dx = 17.93f)
                lineToRelative(dx = 0.05f, dy = 0.01f)
                horizontalLineTo(x = 22.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.35f, dx3 = 0.75f, dy3 = -0.76f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.01f, y = 14.75f)
                horizontalLineToRelative(dx = -12.0f)
                lineTo(x = 3.0f, y = 13.25f)
                horizontalLineToRelative(dx = 12.0f)
                close()
                moveToRelative(dx = -6.01f, dy = 8.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.25f, y1 = 22.0f)
                verticalLineToRelative(dy = -3.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineTo(y = 22.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -12.0f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.5f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.5f)
            }
        }.build().also { _buildingThree = it }
    }

@Suppress("ObjectPropertyName")
private var _buildingThree: ImageVector? = null
