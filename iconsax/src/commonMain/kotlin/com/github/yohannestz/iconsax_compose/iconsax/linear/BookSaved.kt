package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 4.67f)
                verticalLineToRelative(dy = 12.07f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.74f, dy1 = 1.98f)
                lineToRelative(dx = -0.33f, dy = 0.04f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.46f, dy1 = 2.46f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.96f, dy1 = 0.0f)
                lineToRelative(dx = -0.04f, dy = -0.02f)
                arcToRelative(a = 26.0f, b = 26.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.44f, dy1 = -2.44f)
                lineToRelative(dx = -0.29f, dy = -0.04f)
                arcTo(horizontalEllipseRadius = 2.05f, verticalEllipseRadius = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.74f)
                verticalLineTo(y = 4.66f)
                arcToRelative(a = 1.97f, b = 1.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.16f, dy1 = -1.99f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.06f, dy1 = 2.34f)
                lineToRelative(dx = 0.25f, dy = 0.15f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.17f, dy = -0.11f)
                arcTo(horizontalEllipseRadius = 15.0f, verticalEllipseRadius = 15.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 3.92f)
                verticalLineTo(y = 8.0f)
                lineToRelative(dx = 2.0f, dy = -1.33f)
                lineTo(x = 19.0f, y = 8.0f)
                verticalLineTo(y = 2.78f)
                lineToRelative(dx = 0.77f, dy = -0.1f)
                horizontalLineToRelative(dx = 0.06f)
                arcTo(horizontalEllipseRadius = 1.97f, verticalEllipseRadius = 1.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 4.67f)
                moveTo(x = 12.0f, y = 5.49f)
                verticalLineToRelative(dy = 15.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.0f, y = 2.78f)
                verticalLineTo(y = 8.0f)
                lineToRelative(dx = -2.0f, dy = -1.33f)
                lineTo(x = 15.0f, y = 8.0f)
                verticalLineTo(y = 3.92f)
                arcToRelative(a = 20.0f, b = 20.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -1.14f)
            }
        }.build().also { _bookSaved = it }
    }

@Suppress("ObjectPropertyName")
private var _bookSaved: ImageVector? = null
