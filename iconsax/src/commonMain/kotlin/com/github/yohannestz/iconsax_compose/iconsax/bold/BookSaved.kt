package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookSaved: ImageVector
    get() {
        val current = _bookSaved
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookSaved",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.25f, y = 6.0f)
                verticalLineToRelative(dy = 13.9f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.37f, dy1 = 0.94f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.81f, dy1 = -1.68f)
                lineToRelative(dx = -0.31f, dy = -0.04f)
                arcTo(horizontalEllipseRadius = 2.06f, verticalEllipseRadius = 2.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 17.14f)
                verticalLineTo(y = 5.24f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.2f, dx2 = 0.97f, dy2 = -2.16f, dx3 = 2.17f, dy3 = -2.16f)
                horizontalLineToRelative(dx = 0.07f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.48f, dy1 = 2.03f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 6.0f)
                moveToRelative(dx = 8.58f, dy = -2.92f)
                horizontalLineToRelative(dx = -0.06f)
                lineTo(x = 19.0f, y = 3.18f)
                arcToRelative(a = 20.0f, b = 20.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.71f, dy1 = 1.93f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.75f, y1 = 6.0f)
                verticalLineToRelative(dy = 13.9f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.37f, dy1 = 0.94f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.81f, dy1 = -1.68f)
                lineToRelative(dx = 0.31f, dy = -0.04f)
                arcTo(horizontalEllipseRadius = 2.06f, verticalEllipseRadius = 2.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 17.14f)
                verticalLineTo(y = 5.24f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.2f, dx2 = -0.97f, dy2 = -2.16f, dx3 = -2.17f, dy3 = -2.16f)
                moveToRelative(dx = -0.56f, dy = 10.65f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.39f, dx2 = -0.28f, dy2 = 0.56f, dx3 = -0.62f, dy3 = 0.37f)
                lineToRelative(dx = -1.06f, dy = -0.6f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.41f, dy1 = 0.0f)
                lineToRelative(dx = -1.06f, dy = 0.6f)
                curveToRelative(dx1 = -0.34f, dy1 = 0.19f, dx2 = -0.62f, dy2 = 0.02f, dx3 = -0.62f, dy3 = -0.37f)
                verticalLineToRelative(dy = -3.07f)
                arcToRelative(a = 0.85f, b = 0.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = -0.84f)
                horizontalLineToRelative(dx = 2.1f)
                arcToRelative(a = 0.85f, b = 0.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = 0.84f)
                verticalLineToRelative(dy = 3.07f)
                close()
            }
        }.build().also { _bookSaved = it }
    }

@Suppress("ObjectPropertyName")
private var _bookSaved: ImageVector? = null
