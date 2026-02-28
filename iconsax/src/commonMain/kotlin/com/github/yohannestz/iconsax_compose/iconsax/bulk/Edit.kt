package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Edit: ImageVector
    get() {
        val current = _edit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Edit",
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
                moveTo(x = 15.48f, y = 3.0f)
                horizontalLineTo(x = 7.52f)
                curveTo(x1 = 4.07f, y1 = 3.0f, x2 = 2.0f, y2 = 5.06f, x3 = 2.0f, y3 = 8.52f)
                verticalLineToRelative(dy = 7.95f)
                curveTo(x1 = 2.0f, y1 = 19.94f, x2 = 4.07f, y2 = 22.0f, x3 = 7.52f, y3 = 22.0f)
                horizontalLineToRelative(dx = 7.95f)
                curveToRelative(dx1 = 3.46f, dy1 = 0.0f, dx2 = 5.52f, dy2 = -2.06f, dx3 = 5.52f, dy3 = -5.52f)
                verticalLineTo(y = 8.52f)
                curveTo(x1 = 21.0f, y1 = 5.06f, x2 = 18.93f, y2 = 3.0f, x3 = 15.48f, y3 = 3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.02f, y = 2.98f)
                curveToRelative(dx1 = -1.79f, dy1 = -1.8f, dx2 = -3.54f, dy2 = -1.84f, dx3 = -5.38f, dy3 = 0.0f)
                lineTo(x = 14.51f, y = 4.1f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.09f, dy1 = 0.37f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.11f, dy1 = 5.1f)
                quadToRelative(dx1 = 0.05f, dy1 = 0.03f, dx2 = 0.11f, dy2 = 0.02f)
                quadToRelative(dx1 = 0.16f, dy1 = 0.0f, dx2 = 0.27f, dy2 = -0.11f)
                lineToRelative(dx = 1.11f, dy = -1.12f)
                quadTo(x1 = 22.38f, y1 = 7.0f, x2 = 22.38f, y2 = 5.69f)
                quadToRelative(dx1 = 0.0f, dy1 = -1.35f, dx2 = -1.36f, dy2 = -2.71f)
                moveToRelative(dx = -3.16f, dy = 7.44f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.04f, dy1 = -1.34f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.95f, dy1 = -0.96f)
                quadToRelative(dx1 = -0.04f, dy1 = -0.03f, dx2 = -0.13f, dy2 = -0.17f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = -0.51f)
                arcToRelative(a = 7.88f, b = 7.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = -2.1f)
                lineTo(x = 7.9f, y = 10.72f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.76f, dy1 = 1.5f)
                lineTo(x = 6.71f, y = 15.2f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = 1.61f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.28f, dy1 = 0.5f)
                lineToRelative(dx = 0.33f, dy = -0.02f)
                lineToRelative(dx = 2.97f, dy = -0.42f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.5f, dy1 = -0.76f)
                lineToRelative(dx = 5.38f, dy = -5.38f)
                quadToRelative(dx1 = -0.37f, dy1 = -0.12f, dx2 = -0.78f, dy2 = -0.31f)
            }
        }.build().also { _edit = it }
    }

@Suppress("ObjectPropertyName")
private var _edit: ImageVector? = null
