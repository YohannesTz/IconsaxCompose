package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildingFour: ImageVector
    get() {
        val current = _buildingFour
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BuildingFour",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.32f, y = 3.0f)
                horizontalLineTo(x = 5.09f)
                quadTo(x1 = 2.1f, y1 = 3.0f, x2 = 2.1f, y2 = 6.02f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 5.4f)
                verticalLineToRelative(dy = -3.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 5.3f)
                verticalLineTo(y = 6.02f)
                quadTo(x1 = 14.3f, y1 = 3.0f, x2 = 11.32f, y2 = 3.0f)
                moveToRelative(dx = -0.57f, dy = 9.75f)
                horizontalLineTo(x = 5.8f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.95f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 0.0f, dy = -3.75f)
                horizontalLineTo(x = 5.8f)
                curveTo(x1 = 5.39f, y1 = 9.0f, x2 = 5.05f, y2 = 8.66f, x3 = 5.05f, y3 = 8.25f)
                reflectiveCurveTo(x1 = 5.39f, y1 = 7.5f, x2 = 5.8f, y2 = 7.5f)
                horizontalLineToRelative(dx = 4.95f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 11.16f, y1 = 9.0f, x2 = 10.75f, y2 = 9.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 23.0f, y = 21.25f)
                horizontalLineToRelative(dx = -2.27f)
                verticalLineToRelative(dy = -3.0f)
                arcTo(horizontalEllipseRadius = 2.4f, verticalEllipseRadius = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.37f, y1 = 16.0f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 2.39f, b = 2.39f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.76f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.61f, dy1 = 2.24f)
                verticalLineToRelative(dy = 3.01f)
                horizontalLineTo(x = 1.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 0.59f, y1 = 22.75f, x2 = 1.0f, y2 = 22.75f)
                horizontalLineToRelative(dx = 18.93f)
                lineToRelative(dx = 0.05f, dy = 0.01f)
                horizontalLineTo(x = 23.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.35f, dx3 = 0.75f, dy3 = -0.76f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
            }
        }.build().also { _buildingFour = it }
    }

@Suppress("ObjectPropertyName")
private var _buildingFour: ImageVector? = null
