package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayCricle: ImageVector
    get() {
        val current = _playCricle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PlayCricle",
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
                moveTo(x = 19.07f, y = 19.07f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -14.14f)
                moveToRelative(dx = -14.14f, dy = 0.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 14.14f)
                moveToRelative(dx = 3.77f, dy = 2.34f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.6f, dy1 = 0.0f)
                moveTo(x = 8.7f, y = 2.59f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.6f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.74f, y = 10.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.08f, dx2 = 1.47f, dy2 = -2.93f, dx3 = 3.27f, dy3 = -1.89f)
                lineToRelative(dx = 1.45f, dy = 0.84f)
                lineToRelative(dx = 1.45f, dy = 0.84f)
                curveToRelative(dx1 = 1.8f, dy1 = 1.04f, dx2 = 1.8f, dy2 = 2.74f, dx3 = 0.0f, dy3 = 3.78f)
                lineToRelative(dx = -1.45f, dy = 0.84f)
                lineTo(x = 12.0f, y = 15.58f)
                curveToRelative(dx1 = -1.8f, dy1 = 1.04f, dx2 = -3.27f, dy2 = 0.19f, dx3 = -3.27f, dy3 = -1.89f)
            }
        }.build().also { _playCricle = it }
    }

@Suppress("ObjectPropertyName")
private var _playCricle: ImageVector? = null
