package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dropbox: ImageVector
    get() {
        val current = _dropbox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dropbox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 5.0f)
                lineTo(x = 7.56f, y = 2.0f)
                lineTo(x = 2.0f, y = 6.0f)
                lineToRelative(dx = 4.44f, dy = 3.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                lineToRelative(dx = 4.44f, dy = -3.0f)
                lineTo(x = 22.0f, y = 6.0f)
                lineToRelative(dx = -4.44f, dy = 3.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 9.0f)
                lineToRelative(dx = -4.44f, dy = 3.0f)
                lineTo(x = 2.0f, y = 13.0f)
                lineToRelative(dx = 4.44f, dy = -3.0f)
                lineToRelative(dx = 2.08f, dy = 1.5f)
                lineToRelative(dx = 1.62f, dy = 1.16f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                lineToRelative(dx = 4.44f, dy = 3.0f)
                lineTo(x = 22.0f, y = 13.0f)
                lineToRelative(dx = -4.44f, dy = -3.0f)
                close()
                moveToRelative(dx = -7.0f, dy = 4.77f)
                verticalLineTo(y = 15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.0f, y = 15.5f)
                verticalLineToRelative(dy = 3.27f)
                lineToRelative(dx = -6.58f, dy = 3.04f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = 0.0f)
                lineToRelative(dx = -1.9f, dy = -0.88f)
            }
        }.build().also { _dropbox = it }
    }

@Suppress("ObjectPropertyName")
private var _dropbox: ImageVector? = null
