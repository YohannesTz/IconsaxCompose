package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Judge: ImageVector
    get() {
        val current = _judge
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Judge",
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
                moveTo(x = 20.01f, y = 18.51f)
                lineToRelative(dx = -4.95f, dy = -4.95f)
                moveToRelative(dx = 0.0f, dy = 0.0f)
                lineToRelative(dx = -3.54f, dy = 3.54f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.83f, dy1 = 0.0f)
                lineToRelative(dx = -4.24f, dy = -4.24f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -2.83f)
                lineToRelative(dx = 7.07f, dy = -7.07f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.83f, dy1 = 0.0f)
                lineToRelative(dx = 4.24f, dy = 4.24f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.83f)
                close()
                moveTo(x = 2.0f, y = 21.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveTo(x = 6.56f, y = 7.92f)
                lineToRelative(dx = 7.07f, dy = 7.07f)
            }
        }.build().also { _judge = it }
    }

@Suppress("ObjectPropertyName")
private var _judge: ImageVector? = null
