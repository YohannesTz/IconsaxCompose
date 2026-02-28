package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookmarkTwo: ImageVector
    get() {
        val current = _bookmarkTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookmarkTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 4.96f)
                verticalLineToRelative(dy = 7.12f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.99f, dx2 = -1.41f, dy2 = 2.76f, dx3 = -3.14f, dy3 = 1.72f)
                lineTo(x = 12.54f, y = 13.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = 0.0f)
                lineToRelative(dx = -1.32f, dy = 0.8f)
                curveTo(x1 = 8.41f, y1 = 14.84f, x2 = 7.0f, y2 = 14.07f, x3 = 7.0f, y3 = 12.08f)
                verticalLineTo(y = 4.99f)
                quadTo(x1 = 7.02f, y1 = 2.0f, x2 = 10.0f, y2 = 2.0f)
                horizontalLineToRelative(dx = 4.0f)
                quadToRelative(dx1 = 2.97f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 2.96f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 11.9f)
                verticalLineToRelative(dy = 3.03f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.05f, dx2 = -2.0f, dy2 = 7.07f, dx3 = -7.0f, dy3 = 7.07f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.02f, dx3 = -7.0f, dy3 = -7.07f)
                verticalLineTo(y = 11.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.69f, dx2 = 0.57f, dy2 = -4.52f, dx3 = 1.85f, dy3 = -5.64f)
                curveTo(x1 = 4.5f, y1 = 5.71f, x2 = 5.5f, y2 = 6.19f, x3 = 5.5f, y3 = 7.04f)
                verticalLineToRelative(dy = 5.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.49f, dx2 = 0.61f, dy2 = 2.69f, dx3 = 1.67f, dy3 = 3.29f)
                curveToRelative(dx1 = 1.07f, dy1 = 0.61f, dx2 = 2.43f, dy2 = 0.5f, dx3 = 3.75f, dy3 = -0.29f)
                lineTo(x = 12.0f, y = 14.43f)
                lineToRelative(dx = 1.09f, dy = 0.65f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.23f, dy1 = 0.68f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.51f, dy1 = -0.39f)
                curveToRelative(dx1 = 1.06f, dy1 = -0.6f, dx2 = 1.67f, dy2 = -1.8f, dx3 = 1.67f, dy3 = -3.29f)
                verticalLineTo(y = 7.03f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.85f, dx2 = 1.01f, dy2 = -1.33f, dx3 = 1.65f, dy3 = -0.77f)
                curveTo(x1 = 21.43f, y1 = 7.38f, x2 = 22.0f, y2 = 9.21f, x3 = 22.0f, y3 = 11.9f)
            }
        }.build().also { _bookmarkTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _bookmarkTwo: ImageVector? = null
