package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Danger: ImageVector
    get() {
        val current = _danger
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Danger",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.76f, y = 15.92f)
                lineTo(x = 15.36f, y = 4.4f)
                curveTo(x1 = 14.5f, y1 = 2.85f, x2 = 13.31f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 9.5f, y1 = 2.85f, x2 = 8.64f, y2 = 4.4f)
                lineToRelative(dx = -6.4f, dy = 11.52f)
                curveToRelative(dx1 = -0.81f, dy1 = 1.47f, dx2 = -0.9f, dy2 = 2.88f, dx3 = -0.25f, dy3 = 3.99f)
                reflectiveCurveToRelative(dx1 = 1.93f, dy1 = 1.72f, dx2 = 3.61f, dy2 = 1.72f)
                horizontalLineToRelative(dx = 12.8f)
                curveToRelative(dx1 = 1.68f, dy1 = 0.0f, dx2 = 2.96f, dy2 = -0.61f, dx3 = 3.61f, dy3 = -1.72f)
                reflectiveCurveToRelative(dx1 = 0.56f, dy1 = -2.53f, dx2 = -0.25f, dy2 = -3.99f)
                moveTo(x = 11.25f, y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 8.59f, x2 = 12.75f, y2 = 9.0f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                close()
                moveToRelative(dx = 1.46f, dy = 8.71f)
                lineToRelative(dx = -0.15f, dy = 0.12f)
                lineToRelative(dx = -0.18f, dy = 0.09f)
                lineToRelative(dx = -0.19f, dy = 0.06f)
                lineTo(x = 12.0f, y = 18.0f)
                lineToRelative(dx = -0.2f, dy = -0.02f)
                lineToRelative(dx = -0.18f, dy = -0.06f)
                lineToRelative(dx = -0.18f, dy = -0.09f)
                lineToRelative(dx = -0.15f, dy = -0.12f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 17.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.71f)
                lineToRelative(dx = 0.15f, dy = -0.12f)
                lineToRelative(dx = 0.18f, dy = -0.09f)
                lineToRelative(dx = 0.18f, dy = -0.06f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.39f, dy1 = 0.0f)
                lineToRelative(dx = 0.19f, dy = 0.06f)
                lineToRelative(dx = 0.18f, dy = 0.09f)
                lineToRelative(dx = 0.15f, dy = 0.12f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.0f, y1 = 17.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.71f)
            }
        }.build().also { _danger = it }
    }

@Suppress("ObjectPropertyName")
private var _danger: ImageVector? = null
