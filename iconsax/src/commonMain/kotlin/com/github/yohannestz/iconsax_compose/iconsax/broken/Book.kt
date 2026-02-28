package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Book: ImageVector
    get() {
        val current = _book
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Book",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 11.0f)
                verticalLineTo(y = 4.66f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.2f, dx2 = -0.98f, dy2 = -2.09f, dx3 = -2.17f, dy3 = -1.99f)
                horizontalLineToRelative(dx = -0.06f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.07f, dy1 = 2.37f)
                lineToRelative(dx = -0.17f, dy = 0.11f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -0.25f, dy = -0.15f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.06f, dy1 = -2.34f)
                arcToRelative(a = 1.97f, b = 1.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.16f, dy1 = 2.0f)
                verticalLineToRelative(dy = 12.07f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.74f, dy1 = 1.98f)
                lineToRelative(dx = 0.29f, dy = 0.04f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.44f, dy1 = 2.44f)
                lineToRelative(dx = 0.04f, dy = 0.02f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.96f, dy1 = 0.0f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.46f, dy1 = -2.46f)
                lineToRelative(dx = 0.33f, dy = -0.04f)
                arcTo(horizontalEllipseRadius = 2.05f, verticalEllipseRadius = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 16.74f)
                verticalLineToRelative(dy = -1.72f)
                moveTo(x = 12.0f, y = 5.5f)
                verticalLineToRelative(dy = 15.0f)
                moveToRelative(dx = -4.25f, dy = -12.0f)
                horizontalLineTo(x = 5.5f)
                moveToRelative(dx = 3.0f, dy = 3.0f)
                horizontalLineToRelative(dx = -3.0f)
            }
        }.build().also { _book = it }
    }

@Suppress("ObjectPropertyName")
private var _book: ImageVector? = null
