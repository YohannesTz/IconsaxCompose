package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableLamp: ImageVector
    get() {
        val current = _tableLamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TableLamp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.2f, y = 15.44f)
                horizontalLineTo(x = 5.8f)
                curveToRelative(dx1 = -1.03f, dy1 = 0.0f, dx2 = -1.94f, dy2 = -0.42f, dx3 = -2.5f, dy3 = -1.15f)
                reflectiveCurveToRelative(dx1 = -0.72f, dy1 = -1.72f, dx2 = -0.45f, dy2 = -2.71f)
                lineToRelative(dx = 2.2f, dy = -8.08f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.95f, dy1 = -2.25f)
                horizontalLineToRelative(dx = 8.0f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.96f, dy1 = 2.25f)
                lineToRelative(dx = 2.2f, dy = 8.08f)
                curveToRelative(dx1 = 0.27f, dy1 = 0.99f, dx2 = 0.1f, dy2 = 1.98f, dx3 = -0.45f, dy3 = 2.71f)
                reflectiveCurveToRelative(dx1 = -1.46f, dy1 = 1.15f, dx2 = -2.5f, dy2 = 1.15f)
                moveTo(x = 8.0f, y = 2.75f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.5f, dy1 = 1.15f)
                lineToRelative(dx = -2.2f, dy = 8.08f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = 1.41f)
                curveToRelative(dx1 = 0.28f, dy1 = 0.37f, dx2 = 0.74f, dy2 = 0.56f, dx3 = 1.3f, dy3 = 0.56f)
                horizontalLineTo(x = 18.2f)
                curveToRelative(dx1 = 0.56f, dy1 = 0.0f, dx2 = 1.03f, dy2 = -0.2f, dx3 = 1.3f, dy3 = -0.56f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = -1.41f)
                lineTo(x = 17.5f, y = 3.9f)
                arcTo(horizontalEllipseRadius = 1.7f, verticalEllipseRadius = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 22.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 22.75f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 21.25f, x2 = 8.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _tableLamp = it }
    }

@Suppress("ObjectPropertyName")
private var _tableLamp: ImageVector? = null
