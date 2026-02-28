package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Key: ImageVector
    get() {
        val current = _key
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Key",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.99f, y = 2.15f)
                arcToRelative(a = 7.57f, b = 7.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.8f, dy1 = 12.77f)
                arcToRelative(a = 7.6f, b = 7.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.6f, dy1 = 1.87f)
                lineToRelative(dx = -4.71f, dy = 4.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.49f)
                lineToRelative(dx = -2.17f, dy = -0.3f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = -1.5f)
                lineTo(x = 2.0f, y = 18.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = -1.49f)
                lineToRelative(dx = 1.12f, dy = -1.12f)
                lineToRelative(dx = 3.57f, dy = -3.57f)
                arcToRelative(a = 7.6f, b = 7.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.88f, dy1 = -7.6f)
                moveTo(x = 6.89f, y = 17.49f)
                lineToRelative(dx = 2.3f, dy = 2.3f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.5f, y = 11.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.0f)
            }
        }.build().also { _key = it }
    }

@Suppress("ObjectPropertyName")
private var _key: ImageVector? = null
