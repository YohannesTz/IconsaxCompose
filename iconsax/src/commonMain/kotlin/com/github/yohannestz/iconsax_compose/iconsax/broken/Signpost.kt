package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Signpost: ImageVector
    get() {
        val current = _signpost
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Signpost",
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
                moveTo(x = 13.03f, y = 2.0f)
                horizontalLineTo(x = 8.96f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.09f, dy1 = 0.38f)
                lineTo(x = 5.68f, y = 4.13f)
                arcToRelative(a = 1.74f, b = 1.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.73f)
                lineTo(x = 7.87f, y = 8.6f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.09f, dy1 = 0.38f)
                horizontalLineToRelative(dx = 8.26f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.75f, dy1 = -1.75f)
                verticalLineToRelative(dy = -3.5f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.75f, dy1 = -1.75f)
                moveTo(x = 6.8f, y = 12.0f)
                horizontalLineToRelative(dx = 8.26f)
                quadToRelative(dx1 = 0.61f, dy1 = 0.01f, dx2 = 1.09f, dy2 = 0.38f)
                lineToRelative(dx = 2.19f, dy = 1.75f)
                arcToRelative(a = 1.74f, b = 1.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.73f)
                lineToRelative(dx = -2.19f, dy = 1.75f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.09f, dy1 = 0.38f)
                horizontalLineTo(x = 6.8f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = -1.75f)
                verticalLineToRelative(dy = -3.5f)
                arcTo(horizontalEllipseRadius = 1.74f, verticalEllipseRadius = 1.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.8f, y1 = 12.0f)
                moveToRelative(dx = 5.2f, dy = 0.0f)
                verticalLineTo(y = 9.0f)
                moveToRelative(dx = 0.0f, dy = 13.0f)
                verticalLineToRelative(dy = -3.0f)
                moveToRelative(dx = -3.0f, dy = 3.0f)
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _signpost = it }
    }

@Suppress("ObjectPropertyName")
private var _signpost: ImageVector? = null
